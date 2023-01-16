## Lab#SE00-1: Maven Person 
### Tasks


4. [x] Create a Maven/Gradle Java SE Project with the UML and classes defined below.
2. [x] Add Lombok, JUnit and Faker dependencies 

3. [x] Refactor: remove boilerplate code (getters, setters and so on) and work with Lombok

4. [x] Create Junit tests to test objects. Use Faker to create objects:
   - [x] Test createPerson: check weather the object Person creation works properly.
   - [x] Test createCar: check weather the object Car creation works properly.
   - [x] Test createBook: check weather the object Book creation works properly.
   - [x] Test createStudent: check weather the object Student creation works properly
   - [x] Without composition: a Student object without car and books.
   - [x] With composition: a Student object with Car object and Book List objects
   Create Junit tests to test operations:

5. [x] Test methodsPerson: check weathe methods Person works properly: becomeOlder(), killVampire(), withFirstName()
6. [x] Improve Car, Book and Author classes with two methods each.


***

### Junit test Code sample

```
    public Student studentObject() {
        return new Student("Sergi", "Aznale", 39, "UB", new Car(4, 5, "groc"));
    }


    @Test
    public void addBookGetBooksTest(){
        Faker faker = new Faker();
        Book llibre = new Book(faker.book().title(),faker.random().nextInt(50,600),faker.random().hex(13),new Author(faker.book().author(),faker.animal().name(),faker.random().nextInt(15,80)));
        Book llibre2 = new Book(faker.book().title(),faker.random().nextInt(50,600),faker.random().hex(13),new Author(faker.book().author(),faker.animal().name(),faker.random().nextInt(15,80)));
        Student student = studentObject();
        student.addBook(llibre);
        student.addBook(llibre2);
        Assertions.assertEquals(llibre,student.getBooks().get(0));
        Assertions.assertEquals(llibre2,student.getBooks().get(1));
        System.out.println(student);
    } 
```

