package com.ricston.injectionexample.domain;

import javax.inject.Inject;

public class Person {

    private Body body;

    @Inject
    public Person(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }


}
