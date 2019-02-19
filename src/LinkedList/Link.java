package LinkedList;

public class Link {

    public String bookname;
    public int millionSold;

    public Link next;

    public Link(String bookname, int millionSold) {
        this.bookname = bookname;
        this.millionSold = millionSold;
    }

    public void display(){
        System.out.println(bookname+": "+millionSold + ",000,000");
    }

    @Override
    public String toString() {
        return "Link{" +
                "bookname='" + bookname + '\'' +
                '}';
    }

    public static void main(String args[]){

        LinkList linkList = new LinkList();

        linkList.insertLink("Suhani", 100);
        linkList.insertLink("Hiral", 200);
        linkList.insertLink("Sagar", 300);
        linkList.insertLink("Dodia", 400);

        linkList.displayEverything();


    }
}

class LinkList {

    public Link firstLink;

    public LinkList() {
        firstLink = null;
    }

    public boolean isEmpty(){
        return firstLink == null;
    }

    public void insertLink(String bookname, int millionSold){
        Link newLink = new Link(bookname, millionSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public void removeFirst(){
        Link linkRef = firstLink;

        if(!isEmpty()){
            firstLink = firstLink.next;
            System.out.println("Removed!");
        }else {
            System.out.println("Empty linklist!");
        }
    }

    public void displayEverything(){

        Link theLink = firstLink;

        while(theLink != null){
            theLink.display();
            System.out.println("Next: "+theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName){
        Link theLink = firstLink;

        if(isEmpty()){
           System.out.println("Its Empty!");
        }else {
            while (theLink.bookname != bookName){
                if(theLink.next == null){
                    return null;
                }else {
                    theLink = theLink.next;
                }
            }
        }

        return theLink;
    }

    public void removeLink(String bookName){

        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while(currentLink.bookname != bookName){

            if(currentLink.next == null){
                System.out.println("Not found!");
            }else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink){
            firstLink = firstLink.next;
            System.out.println("Removed - it was first!");
        }else {
            previousLink.next = currentLink.next;
            System.out.println("Removed!");
        }
    }
}