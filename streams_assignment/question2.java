package streams_assignment;

import java.util.*;
import java.util.function.Consumer;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}

public class question2 {
    public static int maxComments(List<News> news) {
        HashMap<Integer, Integer> newsCommentCount = new HashMap<Integer, Integer>();

        Consumer<List<News>> countComments = news1 -> {
            for (News value : news1) {
                int newsId = value.getNewsId();
                newsCommentCount.put(newsId, newsCommentCount.getOrDefault(newsId, 0) + 1);
            }
        };
        countComments.accept(news);

        int maxCommentNewsId = 0;
        int maxCommentCount = 0;
        for (Map.Entry<Integer, Integer> entry : newsCommentCount.entrySet()) {
            if (entry.getValue() > maxCommentCount) {
                maxCommentCount = entry.getValue();
                maxCommentNewsId = entry.getKey();
            }
        }
        return maxCommentNewsId;
    }

    public static int budgetCount(List<News> news) {
        int[] budgetWordCount = { 0 };

        Consumer<List<News>> countBudget = news1 -> {
            for (News n : news1) {
                String comment = n.getComment();
                String[] commentWords = comment.split(" ");
                for (String str : commentWords) {
                    if (str.toLowerCase().equals("budget")) {
                        budgetWordCount[0] += 1;
                    }
                }
            }
        };
        countBudget.accept(news);
        return budgetWordCount[0];
    }

    public static String maxCommentsByUser(List<News> news) {
        HashMap<String, Integer> newsCommentCount = new HashMap<String, Integer>();

        Consumer<List<News>> countComments = news1 -> {
            for (News value : news1) {
                String user = value.getCommentByUser();
                newsCommentCount.put(user, newsCommentCount.getOrDefault(user, 0) + 1);
            }
        };
        countComments.accept(news);

        String maxCommentsByUser = "";
        int maxCommentCount = 0;
        for (Map.Entry<String, Integer> entry : newsCommentCount.entrySet()) {
            if (entry.getValue() > maxCommentCount) {
                maxCommentCount = entry.getValue();
                maxCommentsByUser = entry.getKey();
            }
        }
        return maxCommentsByUser;
    }

    public static Map<String, Integer> sortMaxCommentsByUser(List<News> news) {
        Map<String, Integer> userCommentCount = new LinkedHashMap<>();

        Consumer<List<News>> countCommentByUser = news1 -> {
            for (News n : news1) {
                String commentUser = n.getCommentByUser();
                userCommentCount.put(commentUser, userCommentCount.getOrDefault(commentUser, 0) + 1);
            }
        };
        countCommentByUser.accept(news);
        return userCommentCount;
    }

    public static void main(String[] args) {

        List<News> news = new ArrayList<>();
        news.add(new News(102, "aa2", "bb1", "good budget"));
        news.add(new News(101, "aa1", "bb2", "good"));
        news.add(new News(101, "aa1", "bb2", "budget"));
        news.add(new News(101, "aa1", "bb4", "good"));

        // Find out the newsId which has received maximum comments
        int maxCommentNewsId = maxComments(news);
        System.out.println("NewsId with max comments : " + maxCommentNewsId);

        // Find out how many times the word 'budget' arrived in user comments all news
        int budgetWordCount = budgetCount(news);
        System.out.println("Budget word count : " + budgetWordCount);

        // Find out which user has posted maximum comments
        String maxUserComments = maxCommentsByUser(news);
        System.out.println("User with most comments : " + maxUserComments);

        // Display commentByUser wise number of comments.
        Map<String, Integer> userCommentCount = sortMaxCommentsByUser(news);
        System.out.println(userCommentCount);

    }
}
