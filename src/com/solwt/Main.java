package com.solwt;

public class Main {

    public static void main(String[] args) {
    String role = "haroun";

    switch (role){
        case "Admin":
            System.out.println("You Are an Admin");
            break;

        case "moderator":
            System.out.println(" you Are a Moderator");
            break;

            default:
                System.out.println(" you are a guest");

        }
    }


    }
