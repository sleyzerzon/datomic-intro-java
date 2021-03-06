package nl.finalist.datomic.intro;


public class Solutions
{
    public static final String solution1 = "[:find ?p :in $ :where " +
                                           "[?p :name]]";
    public static final String solution2 = "[:find ?p :in $ :where " + 
                                           "[?p :person/height]]";
    public static final String solution3 = "[:find ?cn (count ?c) (avg ?h)  :in $ :where " +
                                           "[?p :person/height ?h][?p :country ?c][?c :name ?cn]]";
    public static final String solution4 = "[:find ?t ?s :in $ ?n :where " +
                                           "[?p :name ?n]" +
                                           "[?p :player/salary ?s]" +
                                           "[?p :player/team ?team]" + 
                                           "[?team :name ?t]]";
    public static final String solution5 = "[:find ?instant :in $ ?n :where " + 
                                           "[?p :player/salary _ ?tx]" +
                                           "[?tx :db/txInstant ?instant]]";    
    //  database argument should be: conn.db().asOf( year2011 )
    public static final String solution6 = "[:find ?s ?c :in $ :where " +
                                           "[?t :twitter/screenName ?s]" +
                                           "[?t :twitter/followersCount ?c]" +
                                           "[(> ?c 1000000)]]";
    public static final String solution7 = "[:find ?name :in $ ?a1 :where " +
                                           "[?p1 :name ?a1]" + 
                                           "[?p1 :player/twitter.screenName ?s1]" +
                                           "[?tw :twitter/screenName ?s1]" +
                                           "[?tw :twitter/followers ?fs]" +
                                           "[?fs :twitter/screenName ?s2]" +
                                           "[?p2 :player/twitter.screenName ?s2]" +
                                           "[?p2 :name ?name]]";
    public static final String solution8 = "[[[goalkeepers_or_defenders ?e]" +
                                             "[?e :player/position :position/goalkeeper]]" +
                                            "[[goalkeepers_or_defenders ?e]" +
                                             "[?e :player/position :position/defender]]]";
}
