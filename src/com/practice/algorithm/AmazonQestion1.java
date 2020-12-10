import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'topFeatureRequests' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER topFeatures
     *  2. STRING_ARRAY possibleFeatures
     *  3. STRING_ARRAY featureRequests
     */

    public static List<String> topFeatureRequests(int topFeatures, List<String> possibleFeatures, List<String> featureRequests) {
    //Sanitize the possibleFeatures word and add to set
    Set<String> set = new HashSet<>();
    for(String feature : possibleFeatures) {
        String normalizedFeature = feature.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        set.add(normalizedFeature);
    }
    Map<String, Integer> count = new HashMap<>();
    //Loop through feature requests
    for(String request : featureRequests) {
        //Sanitize the request
        String normalizedRequest = request.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        //Split requests into word array
        String[] requestWords = normalizedRequest.split("\\s+");
        Set<String> uniqueRequestWords = new HashSet<>();
        //Loop through each word and add to map count for each word encountered
        for(String s : requestWords) {
            if(set.contains(s) && !uniqueRequestWords.contains(s)) {
                count.put(s, count.getOrDefault(s, 0) + 1);
                uniqueRequestWords.add(s);
            }
        }
    }

    //Create topKeys list to store the requested features
    List<String> topKeys = new ArrayList<>(count.keySet());
    //Sort the topKeys base on the count of requested features but if the count is equal, sort it base on the feature by alphabetical order
    Collections.sort(topKeys, (a,b) -> (count.get(a)).equals(count.get(b)) ? a.compareTo(b) : count.get(b) - count.get(a));

    //return top N topFeatures but if topFeatures is more than the size of topKeys, then return N topKeys.size()
    return topKeys.subList(0, topFeatures > topKeys.size() ? topKeys.size() : topFeatures);

    }

}