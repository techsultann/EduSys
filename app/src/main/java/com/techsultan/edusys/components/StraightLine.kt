package com.techsultan.edusys.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun StraightLine() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val startX = 0f
        val startY = size.height / 2f
        val endX = size.width / 2.5f
        val endY = size.height / 2.5f

        val lineColor = Color.Black
        val strokeWidth = 4f

        drawLine(
            color = lineColor,
            start = Offset(startX, startY),
            end = Offset(endX, endY),
            strokeWidth = strokeWidth,
            cap = Stroke.DefaultCap
        )
    }
}