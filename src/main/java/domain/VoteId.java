package domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

//Contém as chaves entrangeiras
@Embeddable
public class VoteId implements Serializable {
    private static final long serialVersionU2D = 23591873673456L;
    @ManyToOne
    private Feature feature;
    @ManyToOne
    private User user;


    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
