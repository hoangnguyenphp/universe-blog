package com.hn369.universeblog.service.entity.serialarticle;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.UUID;

import com.hn369.universeblog.service.entity.language.Language;

@Entity
@Table(name = "serial_article")
public class SerialArticle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_article_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "serial_article_uuid", nullable = false, unique = true, length = 100)
    private String uuid;

    @Column(name = "serial_article_name", length = 255)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "default_language_code",
        referencedColumnName = "language_code",
        foreignKey = @ForeignKey(name = "fk_serial_article_language")
    )
    private Language defaultLanguage;

    // --- Constructors ---
    public SerialArticle() {
        this.uuid = UUID.randomUUID().toString();
    }

    // --- Getters and Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(Language defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    // --- equals & hashCode (by id) ---
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SerialArticle)) return false;
        SerialArticle that = (SerialArticle) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
