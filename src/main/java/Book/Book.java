package Book;

public class Book {
    private String name;//书名
    private String author;//作者
    private int price;//价格
    private String type;//类型
    private boolean isBorrowed;//是否被借出,初始值是false,在构造方法中不用写

    public Book(String name, String author, int price, String type) {//构造方法
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return
                "书名：'" + name + '\'' +
                ", 作者：'" + author + '\'' +
                ", 价格：" + price +
                ", 风格类型：'" + type + '\'' +
                ", 是否已借出=" +(isBorrowed==true?"   已借出":"  未借出")
                ;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}