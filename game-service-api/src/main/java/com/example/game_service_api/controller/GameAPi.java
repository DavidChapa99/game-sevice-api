package com.example.game_service_api.controller;

import com.example.game_service_api.commons.constants.ApiPathConstants;
import com.example.game_service_api.commons.entities.GameModel;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathConstants.V1_ROUTE + ApiPathConstants.GAME_ROUTE)
public interface GameAPi {
    @PostMapping(value = "create")
    ResponseEntity<GameModel> createGame(
            @RequestBody GameModel gameRequest
    );
}
