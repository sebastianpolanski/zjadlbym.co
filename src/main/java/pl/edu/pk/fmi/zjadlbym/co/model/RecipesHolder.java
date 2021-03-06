package pl.edu.pk.fmi.zjadlbym.co.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class RecipesHolder implements Serializable
{
    @JsonProperty("title")
    private String siteName;

    @JsonProperty("version")
    private double apiVersion;

    @JsonProperty("href")
    private String siteUrl;

    @JsonProperty("results")
    private List<Recipe> recipes;

    public String getSiteName()
    {
        return siteName;
    }

    public void setSiteName(String siteName)
    {
        this.siteName = siteName.trim();
    }

    public double getApiVersion()
    {
        return apiVersion;
    }

    public void setApiVersion(double apiVersion)
    {
        this.apiVersion = apiVersion;
    }

    public String getSiteUrl()
    {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl)
    {
        this.siteUrl = siteUrl.trim();
    }

    public List<Recipe> getRecipes()
    {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes)
    {
        this.recipes = recipes;
    }
}
