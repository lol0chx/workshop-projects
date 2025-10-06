package week_2_Neighborhood_Library;

public class Books {
int id;
String isbn;
String title;
boolean ischeckedout;
String checkedoutto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIscheckedout() {
        return ischeckedout;
    }

    public void setIscheckedout(boolean ischeckedout) {
        this.ischeckedout = ischeckedout;
    }

    public String getCheckoutto() {
        return checkedoutto;
    }

    public void setCheckoutto(String checkoutto) {
        this.checkedoutto = checkoutto;
    }

    public Books(int id, String isbn, String title, boolean ischeckedout, String checkoutto) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.ischeckedout = ischeckedout;
        this.checkedoutto = checkoutto;
    }

    public void Checkout (String name){
        if(!ischeckedout) {
            ischeckedout = true;
            checkedoutto = name;
            System.out.println(title+ " has been checked out to  "+ name );
        }else {
            System.out.println(title + " is already checked out to "+ checkedoutto);
        }
 }
   public void checkin(){
        if(ischeckedout){
            System.out.println(title + " has been returned by "+ checkedoutto + ".");
            ischeckedout =false;
            checkedoutto="";
        }else {
            System.out.println(title + " is already checked in");
        }
   }

}
