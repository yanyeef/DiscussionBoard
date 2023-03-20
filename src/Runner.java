import java.util.*;
public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Msg Test 1 uname-mesg: ");
        String one = scan.nextLine();
        String name = one.substring(0, one.indexOf("-"));
        String text = one.substring(one.indexOf("-") + 1);
        MessagePost mes1 = new MessagePost(name, text);

        System.out.println("Msg Test 2 uname-mesg: ");
        String two = scan.nextLine();
        String name2 = two.substring(0, two.indexOf("-"));
        String text2 = two.substring(two.indexOf("-") + 1);
        MessagePost mes2 = new MessagePost(name2, text2);

        System.out.println("Photos: uname-filename-caption: ");
        String photo = scan.nextLine();
        String picName = photo.substring(0, photo.indexOf("-"));
        photo = photo.substring(photo.indexOf("-")+1);
        String fileName = photo.substring(0, photo.indexOf("-"));
        String caption = photo.substring(photo.indexOf("-")+1);
        PhotoPost p = new PhotoPost(picName, fileName, caption);

        NewsFeed news = new NewsFeed();
        news.addMessagePost(mes1);
        news.addMessagePost(mes2);
        news.show();
        p.display();



    }
}
