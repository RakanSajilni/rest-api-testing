package com.sajilni.api.resources;

import com.sajilni.api.entites.Profile;
import com.sajilni.api.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileResource {
    ProfileService profileService = new ProfileService();

    @GetMapping
    public List<Profile> getProfiles() {
        return profileService.getAllProfiles();
    }

    @GetMapping("/{profileName}")
    public Profile getProfile(@PathVariable("profileName") String profileName) {
        return profileService.getProfile(profileName);
    }

    @PostMapping
    public Profile addProfile(Profile profile) {
        return profileService.addProfile(profile);
    }

    @PutMapping("/{profileName}")
    public Profile updateProfile(@PathVariable("profileName") String profileName, Profile profile) {
        profile.setProfileName(profileName);
        return profileService.updateProfile(profile);
    }

    @DeleteMapping("/{profileName}")
    public void removeProfile(@PathVariable("profileName") String profileName) {
        profileService.removeProfile(profileName);
    }

}
