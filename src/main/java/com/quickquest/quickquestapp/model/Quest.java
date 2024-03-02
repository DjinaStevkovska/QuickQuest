package com.quickquest.quickquestapp.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "quest")
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quester_id", nullable = false)
    private Quester quester;

    @Column(name = "quest_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date questDate;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "details", nullable = false)
    private String details;

    @Column(name = "sent", nullable = false)
    private boolean sent = false;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quester getQuester() {
        return quester;
    }

    public void setQuester(Quester quester) {
        this.quester = quester;
    }

    public Date getQuestDate() {
        return questDate;
    }

    public void setQuestDate(Date questDate) {
        this.questDate = questDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
