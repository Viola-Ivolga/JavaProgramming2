package Encaps;

public class Book {
    private String title;
    private String author;
    private double pages;
    private String language;

    public Book(String title, String author, int pages, String language){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.language = language;





    }
    public void setLanguage(String language) {
        if (language.equals("English") || language.equals("German")){
            this.language = language;
    } else {
        this.language = "Invalid input";
    }
  }

  public String getLanguage(){
        return language;
  }
  public  void setTitle(String title){
        this.title = title;
  }

    public String getTitle(){
        return title;
    }

  public void setAuthor(String author){
        this.author = author;
  }

    public String getAuthor(){
        return author;
    }

  public void setPages(Double pages){
        this.pages = pages;
  }

  public Double getPages(){
        return pages;
    }

}
