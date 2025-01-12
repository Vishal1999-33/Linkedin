package LinkedInUtils;

import java.util.List;

public class Profile {
    private String profilePicture;
    private String headline;
    private String summary;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary() {
        return summary;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
