package com.FunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HostingPredicate {
    public static void main(String[] args) {
        Hosting h1=new Hosting(1,"amazon","aws.amazon.com");
        Hosting h2=new Hosting(2,"google","google.com");
        Hosting h3 = new Hosting(3,"linode","linode.com");
        Hosting h4 = new Hosting(4,"liquidweb","liquidweb.com");
        List<Hosting>list= Arrays.asList(new Hosting[]{h1,h2,h3,h4});
        List<Hosting> result = HostingRepository.filterHosting(list, x -> x.getName().startsWith("g"));
        System.out.println("result : " + result);  // google

        List<Hosting> result2 = HostingRepository.filterHosting(list, isDeveloperFriendly());
        System.out.println("result2 : " + result2); // linode

    }

    public static Predicate<Hosting> isDeveloperFriendly() {
        return n -> n.getName().equals("linode");


    }
}
