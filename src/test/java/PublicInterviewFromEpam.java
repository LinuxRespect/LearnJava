

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class PublicInterviewFromEpam {

    public class Author{

        private String fullName;
        private Date birthDate;
        public Author(String fullName, Date birthDate) {
            this.fullName = fullName;
            this.birthDate = birthDate;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }
    }
    public class Book{
        private String name;
        private Date creationDate;
        private int pageCount;
        private List<Author> authorList;


        public Book(){

        }
        public Book(String name, Date creationDate, int pageCount, List<Author> authorList) {
            this.name = name;
            this.creationDate = creationDate;
            this.pageCount = pageCount;
            this.authorList = authorList;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public List<Author> getAuthorList() {
            return authorList;
        }

        public void setAuthorList(List<Author> authorList) {
            this.authorList = authorList;
        }

        public void search(){
            List<Book> bookList = new ArrayList<>();
            bookList.add(new Book("Алгебра", new Date(),221, Arrays.asList(new Author("Tobico", new Date()),
                    new Author("second", new Date()))));
            bookList.add(new Book("Geometria", new Date(),149, Arrays.asList(new Author("Mama", new Date()),
                    new Author("second2", new Date()))));
            bookList.add(new Book("Mathematics", new Date(),300, Arrays.asList(new Author("DUDUD", new Date()),
                    new Author("second3", new Date()))));
            System.out.println("===="+ bookList.size());

        //   List <Book> l= bookList.stream().filter(e->e.pageCount>150).collect(Collectors.toList());
            List  list = bookList.stream()
                    .filter(e->e.pageCount>150)
                    .map(e-> "Name book = "+e.getName() +" ; Full name author = "+e.getAuthorList().get(0).getFullName())
                    .collect(Collectors.toList());
            System.out.println(list);


        }
    }

    public static void main(String[] arqs){
        new PublicInterviewFromEpam().new Book().search();

    }


}
