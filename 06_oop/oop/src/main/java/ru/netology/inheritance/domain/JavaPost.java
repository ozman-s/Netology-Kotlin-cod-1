package ru.netology.inheritance.domain;

public class JavaPost {
  private long id;
  private long authorId;
  private String authorName;
  private String content;
  private long created;
  private int likes;

  public JavaPost() { }

  public JavaPost(long id, long authorId, String authorName, String content, long created, int likes) {
    this.id = id;
    this.authorId = authorId;
    this.authorName = authorName;
    this.content = content;
    this.created = created;
    this.likes = likes;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getCreated() {
    return created;
  }

  public void setCreated(long created) {
    this.created = created;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }
}
