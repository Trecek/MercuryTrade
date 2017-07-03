package com.mercury.platform.shared.entity.adr;

import com.mercury.platform.shared.config.descriptor.adr.AdrComponentDescriptor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class AdrIconDescriptor extends AdrComponentDescriptor {
    private String iconPath = "";
    private Point location = new Point(500,500);
    private Dimension cellSize = new Dimension(96,96);
    private float duration = 9.0f;
}
