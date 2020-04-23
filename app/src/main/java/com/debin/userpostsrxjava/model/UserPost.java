
package com.debin.userpostsrxjava.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserPost {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("featured_media")
    @Expose
    private Integer featuredMedia;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("sticky")
    @Expose
    private Boolean sticky;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("crunchbase_tag")
    @Expose
    private List<Object> crunchbaseTag = null;
    @SerializedName("tc_stories_tax")
    @Expose
    private List<Object> tcStoriesTax = null;
    @SerializedName("tc_event")
    @Expose
    private List<Object> tcEvent = null;
    @SerializedName("jetpack_featured_media_url")
    @Expose
    private String jetpackFeaturedMediaUrl;
    @SerializedName("jetpack_publicize_connections")
    @Expose
    private List<Object> jetpackPublicizeConnections = null;
    @SerializedName("shortlink")
    @Expose
    private String shortlink;
    @SerializedName("rapidData")
    @Expose
    private RapidData rapidData;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("fundingRound")
    @Expose
    private Boolean fundingRound;
    @SerializedName("seoTitle")
    @Expose
    private String seoTitle;
    @SerializedName("seoDescription")
    @Expose
    private String seoDescription;
    @SerializedName("premiumContent")
    @Expose
    private Boolean premiumContent;
    @SerializedName("premiumCutoffPercent")
    @Expose
    private Double premiumCutoffPercent;
    @SerializedName("tc_cb_mapping")
    @Expose
    private List<Object> tcCbMapping = null;
    @SerializedName("associatedEvent")
    @Expose
    private Object associatedEvent;
    @SerializedName("event")
    @Expose
    private Object event;
    @SerializedName("authors")
    @Expose
    private List<Integer> authors = null;
    @SerializedName("hideFeaturedImage")
    @Expose
    private Boolean hideFeaturedImage;
    @SerializedName("_links")
    @Expose
    private Links links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public List<Object> getCrunchbaseTag() {
        return crunchbaseTag;
    }

    public void setCrunchbaseTag(List<Object> crunchbaseTag) {
        this.crunchbaseTag = crunchbaseTag;
    }

    public List<Object> getTcStoriesTax() {
        return tcStoriesTax;
    }

    public void setTcStoriesTax(List<Object> tcStoriesTax) {
        this.tcStoriesTax = tcStoriesTax;
    }

    public List<Object> getTcEvent() {
        return tcEvent;
    }

    public void setTcEvent(List<Object> tcEvent) {
        this.tcEvent = tcEvent;
    }

    public String getJetpackFeaturedMediaUrl() {
        return jetpackFeaturedMediaUrl;
    }

    public void setJetpackFeaturedMediaUrl(String jetpackFeaturedMediaUrl) {
        this.jetpackFeaturedMediaUrl = jetpackFeaturedMediaUrl;
    }

    public List<Object> getJetpackPublicizeConnections() {
        return jetpackPublicizeConnections;
    }

    public void setJetpackPublicizeConnections(List<Object> jetpackPublicizeConnections) {
        this.jetpackPublicizeConnections = jetpackPublicizeConnections;
    }

    public String getShortlink() {
        return shortlink;
    }

    public void setShortlink(String shortlink) {
        this.shortlink = shortlink;
    }

    public RapidData getRapidData() {
        return rapidData;
    }

    public void setRapidData(RapidData rapidData) {
        this.rapidData = rapidData;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Boolean getFundingRound() {
        return fundingRound;
    }

    public void setFundingRound(Boolean fundingRound) {
        this.fundingRound = fundingRound;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public Boolean getPremiumContent() {
        return premiumContent;
    }

    public void setPremiumContent(Boolean premiumContent) {
        this.premiumContent = premiumContent;
    }

    public Double getPremiumCutoffPercent() {
        return premiumCutoffPercent;
    }

    public void setPremiumCutoffPercent(Double premiumCutoffPercent) {
        this.premiumCutoffPercent = premiumCutoffPercent;
    }

    public List<Object> getTcCbMapping() {
        return tcCbMapping;
    }

    public void setTcCbMapping(List<Object> tcCbMapping) {
        this.tcCbMapping = tcCbMapping;
    }

    public Object getAssociatedEvent() {
        return associatedEvent;
    }

    public void setAssociatedEvent(Object associatedEvent) {
        this.associatedEvent = associatedEvent;
    }

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }

    public List<Integer> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Integer> authors) {
        this.authors = authors;
    }

    public Boolean getHideFeaturedImage() {
        return hideFeaturedImage;
    }

    public void setHideFeaturedImage(Boolean hideFeaturedImage) {
        this.hideFeaturedImage = hideFeaturedImage;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
