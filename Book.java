public abstract class Book {
    String title;
    public Book(String title){
        this.title= title;
    }
    abstract void setTitle(String s);
    String getTitle(){
        return this.title;
    }
}
