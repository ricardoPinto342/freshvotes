package domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
    @EmbeddedId
    private VoteId primaryKey;
    private Boolean upvote;

    public VoteId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(VoteId primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }
}
