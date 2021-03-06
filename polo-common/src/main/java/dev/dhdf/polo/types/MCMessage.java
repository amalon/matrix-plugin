package dev.dhdf.polo.types;

import org.json.JSONObject;

public class MCMessage extends MCEvent {
    public final PoloPlayer player;
    public final String message;

    public MCMessage(PoloPlayer player, String message) {
        this.player = player;
        this.message = message;
    }

    @Override
    public JSONObject toJSON() {
        return new JSONObject()
            .put("player", player.toJSON())
            .put("message", this.message);
    }
}
