package com.quickquest.quickquestapp.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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


}
