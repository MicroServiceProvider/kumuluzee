package com.kumuluz.ee.websocket.jetty;

import com.kumuluz.ee.common.Component;
import com.kumuluz.ee.common.KumuluzServer;
import com.kumuluz.ee.common.config.EeConfig;
import com.kumuluz.ee.common.dependencies.EeComponentDef;
import com.kumuluz.ee.common.dependencies.EeComponentType;

import java.util.logging.Logger;

/**
 * @author Tilen Faganel
 */
@EeComponentDef(EeComponentType.WEBSOCKET)
public class WebSocketComponent implements Component {

    private Logger log = Logger.getLogger(WebSocketComponent.class.getSimpleName());

    @Override
    public void init(KumuluzServer server, EeConfig eeConfig) {
    }

    @Override
    public void load() {

        log.info("Initiating WebSocket for Jetty");
    }

    @Override
    public String getImplementationName() {

        return "Jetty";
    }
}