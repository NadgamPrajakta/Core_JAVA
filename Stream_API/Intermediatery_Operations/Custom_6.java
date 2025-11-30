package intermediatary_ops;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Custom_6 {
    public static void main(String[] args) {
    	
        List<TagBundle> bundles = Arrays.asList(
            new TagBundle("alpha", Arrays.asList("java","streams","java")),
            new TagBundle("beta", Arrays.asList("coding","streams")),
            new TagBundle("gamma", Arrays.asList("java","tutorial"))
        );

        
        bundles.stream()
               .flatMap(new BundleToTagStream())               
               .map(new TagNormalizer())                       
               .distinct()                                     // remove duplicates (highlight)
               .sorted(new TagComparator())                     // alphabetical
               .forEach(new TagPrinter());
    }
}

class TagBundle {
    final String name;
    final List<String> tags;
    
    TagBundle(String name, List<String> tags) { 
    	
    	this.name = name; 
    	this.tags = tags; }
}


class BundleToTagStream implements Function<TagBundle, Stream<String>> {
	
    public Stream<String> apply(TagBundle b) { 
    	return b.tags.stream(); }
}


class TagNormalizer implements Function<String, String> {
	
    public String apply(String t) {
    	return t.trim().toLowerCase(); }
}


class TagComparator implements Comparator<String> {
	
    public int compare(String a, String b) { 
    	return a.compareTo(b); }
}


class TagPrinter implements Consumer<String> {
	
    public void accept(String t) { 
    	System.out.println("Tag: " + t); }
}
