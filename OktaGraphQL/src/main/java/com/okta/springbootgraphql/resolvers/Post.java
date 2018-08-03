package com.okta.springbootgraphql.resolvers;

import java.util.ArrayList;

class Post {

    protected int id;
    protected String text;

    Post(int id) {
        this.id = id;
        this.text = "";
        this.comments = new ArrayList<Comment>();
    }

    Post(int id, String text, ArrayList<Comment> comments) {
        this.id = id;
        this.text = text;
        this.comments = comments;
    }

    protected ArrayList<Comment> comments;

}
