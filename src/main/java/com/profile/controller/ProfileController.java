package com.profile.controller;

import com.profile.data.entity.Profile;
import com.profile.data.repository.ProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private final ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @PostMapping("/profile/create")
    public ResponseEntity<?> createProfile(@RequestBody Profile profile) {
        return ResponseEntity.ok().body(profileRepository.save(profile));
    }
}
