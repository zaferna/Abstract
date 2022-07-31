public class Titles extends Book{
    public Titles(String title) {
        super(title);

    }
    @Override
    public void  setTitle(String title){
        System.out.println("a title is : "+ title);
    }
}
