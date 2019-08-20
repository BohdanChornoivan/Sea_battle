package com.spring.sea_battle.controller;

import com.spring.sea_battle.entity.Player;
import com.spring.sea_battle.entity.Shoot;
import com.spring.sea_battle.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class UserCreationController {

    private final PlayerRepository playerRepository;

    @Autowired
    public UserCreationController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping("sea_battle/room/create_player")
    public void create1(@RequestBody Player player){
        playerRepository.save(player);
    }

    @PostMapping("sea_battle/room/player?/getName")
    public String viewName(UUID uuid) {
        return playerRepository.getOne(uuid).getUserName();
    }


}
