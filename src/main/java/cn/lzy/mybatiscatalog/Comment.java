package cn.lzy.mybatiscatalog;

public class Comment {
    private Integer id; //评论id

    private String content; //评论内容

    private String author;  //评论作者

    private Integer aId;    //关联的文章id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aId=" + aId +
                '}';
    }

    public Comment() {
    }

    public Comment(Integer id, String content, String author, Integer aId) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.aId = aId;
    }
}
