package modul6.editha_1202150278.edithadewipurnamasari_1202150278_modul6.model;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class Comment {
    public String uid;

    public String author;

    public String text;



    public Comment() {

        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)

    }



    public Comment(String uid, String author, String text) {

        this.uid = uid;

        this.author = author;

        this.text = text;

    }
}
