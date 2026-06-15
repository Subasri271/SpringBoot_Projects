package com.example.front_back_end;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class CalcController {

    @GetMapping("/calc/add/{a}/{b}")
    public Map<String, Object> add(@PathVariable int a, @PathVariable int b) {
        return Map.of("Operation", "addition", "result", a + b);
    }

    @GetMapping("/calc/sub/{a}/{b}")
    public String saySub(@PathVariable int a, @PathVariable int b) {
        return "Subtraction: " + (a - b);
    }

    @GetMapping("/calc/quo/{a}/{b}")
    public String quo(@PathVariable int a, @PathVariable int b) {
        if (b == 0) return "Error: Cannot divide by 0";
        return "Quotient: " + (a / b);
    }

    @GetMapping("/calc/sqrt/{a}")
    public String squareRoot(@PathVariable double a) {
        if (a < 0) return "Error: Cannot find square root of a negative number";
        return "Square Root: " + String.format("%.2f", Math.sqrt(a));
    }

    @GetMapping("/calc/power/{base}/{exp}")
    public String power(@PathVariable double base, @PathVariable double exp) {
        return "Power: " + String.format("%.2f", Math.pow(base, exp));
    }

    @GetMapping("/calc/log/{a}")
    public String logarithm(@PathVariable double a) {
        if (a <= 0) return "Error: Logarithm undefined for zero or negative numbers";
        return "Log(base10): " + String.format("%.2f", Math.log10(a));
    }

    @GetMapping("/calc/sin/{a}")
    public String sine(@PathVariable double a) {
        return "Sin(" + a + "°): " + String.format("%.2f", Math.sin(Math.toRadians(a)));
    }

    @GetMapping("/calc/cos/{a}")
    public String cosine(@PathVariable double a) {
        return "Cos(" + a + "°): " + String.format("%.2f", Math.cos(Math.toRadians(a)));
    }

    @GetMapping("/calc/tan/{a}")
    public String tangent(@PathVariable double a) {
        return "Tan(" + a + "°): " + String.format("%.2f", Math.tan(Math.toRadians(a)));
    }

    @GetMapping("/calc/spiral/{n}/{values}")
    public String spiral(@PathVariable int n, @PathVariable String values) {
        String[] val = values.split(",");
        if (val.length != n * n)
            return "Error";
        int[][] arr = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(val[index]);
                index++;
            }
        }
        int t = 0;
        int b = n - 1;
        int l = 0;
        int r = n - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("Spiral Order: ");
        while (t <= b && l <= r) {
            for (int j = l; j <= r; j++)
                sb.append(arr[t][j]).append(" ");
            t++;
            for (int i = t; i <= b; i++)
                sb.append(arr[i][r]).append(" ");
            r--;
            if (t <= b) {
                for (int j = r; j >= l; j--)
                    sb.append(arr[b][j]).append(" ");
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--)
                    sb.append(arr[i][l]).append(" ");
                l++;
            }
        }
        return sb.toString();
    }
}