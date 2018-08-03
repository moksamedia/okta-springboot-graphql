package com.okta.springbootgraphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
class Query implements GraphQLQueryResolver {

    Post getPost(int id) {

        if (id == 1) {
            ArrayList<Comment> comments = new  ArrayList<Comment>() {{
                add(new Comment(1, "GraphQL is amazing!"));
            }};
            return new Post(id, "Okta + GraphQL is pretty sweet.", comments);
        }
        else if (id == 2) {
            ArrayList<Comment> comments = new  ArrayList<Comment>() {{
                add(new Comment(1, "I can't believe how easy this is."));
            }};
            return new Post(id, "Is GraphQL better than a REST API?", comments);
        }
        else {
            return null;
        }
    }

}
