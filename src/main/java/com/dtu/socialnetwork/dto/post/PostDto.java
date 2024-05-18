package com.dtu.socialnetwork.dto.post;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.dtu.socialnetwork.models.Post}
 */
public class PostDto implements Serializable {
    private final Integer id;
    private final String caption;
    private final String image;
    private final String video;
    private final Integer userId;
    private final String userFirstName;
    private final String userLastName;
    private final String userEmail;
    private final String userPassword;
    private final String userGender;
    private final List<Integer> userFollowers;
    private final List<Integer> userFollowings;
    private final LocalDateTime createdAt;
    private final List<UserDto> likedByUsers;
    private final List<CommentDto> comments;

    public PostDto(Integer id, String caption, String image, String video, Integer userId, String userFirstName, String userLastName, String userEmail, String userPassword, String userGender, List<Integer> userFollowers, List<Integer> userFollowings, LocalDateTime createdAt, List<UserDto> likedByUsers, List<CommentDto> comments) {
        this.id = id;
        this.caption = caption;
        this.image = image;
        this.video = video;
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userFollowers = userFollowers;
        this.userFollowings = userFollowings;
        this.createdAt = createdAt;
        this.likedByUsers = likedByUsers;
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public String getCaption() {
        return caption;
    }

    public String getImage() {
        return image;
    }

    public String getVideo() {
        return video;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public List<Integer> getUserFollowers() {
        return userFollowers;
    }

    public List<Integer> getUserFollowings() {
        return userFollowings;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<UserDto> getLikedByUsers() {
        return likedByUsers;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostDto entity = (PostDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.caption, entity.caption) &&
                Objects.equals(this.image, entity.image) &&
                Objects.equals(this.video, entity.video) &&
                Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.userFirstName, entity.userFirstName) &&
                Objects.equals(this.userLastName, entity.userLastName) &&
                Objects.equals(this.userEmail, entity.userEmail) &&
                Objects.equals(this.userPassword, entity.userPassword) &&
                Objects.equals(this.userGender, entity.userGender) &&
                Objects.equals(this.userFollowers, entity.userFollowers) &&
                Objects.equals(this.userFollowings, entity.userFollowings) &&
                Objects.equals(this.createdAt, entity.createdAt) &&
                Objects.equals(this.likedByUsers, entity.likedByUsers) &&
                Objects.equals(this.comments, entity.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, caption, image, video, userId, userFirstName, userLastName, userEmail, userPassword, userGender, userFollowers, userFollowings, createdAt, likedByUsers, comments);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "caption = " + caption + ", " +
                "image = " + image + ", " +
                "video = " + video + ", " +
                "userId = " + userId + ", " +
                "userFirstName = " + userFirstName + ", " +
                "userLastName = " + userLastName + ", " +
                "userEmail = " + userEmail + ", " +
                "userPassword = " + userPassword + ", " +
                "userGender = " + userGender + ", " +
                "userFollowers = " + userFollowers + ", " +
                "userFollowings = " + userFollowings + ", " +
                "createdAt = " + createdAt + ", " +
                "likedByUsers = " + likedByUsers + ", " +
                "comments = " + comments + ")";
    }

    /**
     * DTO for {@link com.dtu.socialnetwork.models.User}
     */
    public static class UserDto implements Serializable {
        private final Integer id;
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String password;
        private final String gender;
        private final List<Integer> followers;
        private final List<Integer> followings;

        public UserDto(Integer id, String firstName, String lastName, String email, String password, String gender, List<Integer> followers, List<Integer> followings) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.gender = gender;
            this.followers = followers;
            this.followings = followings;
        }

        public Integer getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getGender() {
            return gender;
        }

        public List<Integer> getFollowers() {
            return followers;
        }

        public List<Integer> getFollowings() {
            return followings;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UserDto entity = (UserDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.firstName, entity.firstName) &&
                    Objects.equals(this.lastName, entity.lastName) &&
                    Objects.equals(this.email, entity.email) &&
                    Objects.equals(this.password, entity.password) &&
                    Objects.equals(this.gender, entity.gender) &&
                    Objects.equals(this.followers, entity.followers) &&
                    Objects.equals(this.followings, entity.followings);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, firstName, lastName, email, password, gender, followers, followings);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "firstName = " + firstName + ", " +
                    "lastName = " + lastName + ", " +
                    "email = " + email + ", " +
                    "password = " + password + ", " +
                    "gender = " + gender + ", " +
                    "followers = " + followers + ", " +
                    "followings = " + followings + ")";
        }
    }

    /**
     * DTO for {@link com.dtu.socialnetwork.models.Comment}
     */
    public static class CommentDto implements Serializable {
        private final Integer id;
        private final String content;
        private final LocalDateTime createdAt;

        public CommentDto(Integer id, String content, LocalDateTime createdAt) {
            this.id = id;
            this.content = content;
            this.createdAt = createdAt;
        }

        public Integer getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CommentDto entity = (CommentDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.content, entity.content) &&
                    Objects.equals(this.createdAt, entity.createdAt);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, content, createdAt);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "content = " + content + ", " +
                    "createdAt = " + createdAt + ")";
        }
    }
}