public class News 
{
    int newsid;
    String postedbyuser;
    String commentedbyuser;
    String comment;


  News(int newsid, String postedbyuser,String commentedbyuser,String comment)
  {
     super();
    this. newsid=newsid;
    this. postedbyuser= postedbyuser;
    this. commentedbyuser=commentedbyuser;
    this.comment=comment;
  }

  public int getNewsId() {
    return newsid;
}
public void setNewsId(int newsId) {
    this.newsid = newsId;
}

public String getPostedByUser() {
    return postedbyuser;
}
public void setPostedByUser(String postedByUser) {
    this.postedbyuser = postedByUser;
}

public String getCommentByUser() {
    return commentedbyuser;
}
public void setCommentByUser(String commentByUser) {
    this.commentedbyuser = commentByUser;
}

public String getComment() {
    return comment;
}
public void setComment(String comment) {
    this.comment = comment;
}

}







