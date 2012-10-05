/**
 * Programming project 4.5 at page 202
 * 
 * 
 */

public class Book
{
    private String title, author, publisher, copyrightDate;
    
    //constructor
    public Book(String bookTitle, String bookAuthor, String bookPublisher, 
            String bookCopyrightDate)
    {
        title = bookTitle;
        author = bookAuthor;
        publisher = bookPublisher;
        copyrightDate = bookCopyrightDate;
    }
    
    //getters
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public String getCopyrightDate()
    {
        return copyrightDate;
    }
    
    //setters
    public void setTitle(String bookTitle)
    {
        title = bookTitle;
    }
    
    public void setAuthor(String bookAuthor)
    {
        author = bookAuthor;
    }
    
    public void setPublisher(String bookPublisher)
    {
        publisher = bookPublisher;
    }
    
    public void setCopyrightDate(String bookCopyrightDate)
    {
        copyrightDate = bookCopyrightDate;
    }
    
    public String toString()
    {
        return "\nTitle:\t\t" + title + "\nAuthor:\t\t" + author + 
                "\nPublisher:\t" + publisher + 
                "\nCopyright Date:\t" + copyrightDate + "\n";
    }
}