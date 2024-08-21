package com.example.game_service_api.service;

import com.example.game_service_api.commons.entities.GameModel;

public interface GameService {
    GameModel createGame(GameModel gameRequest);
}
