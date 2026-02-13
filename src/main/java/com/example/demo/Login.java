@RestController
class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        // SAST test
        if (username.equals("admin") && password.equals("admin123")) {
            return "Login success";
        }

        return "Login failed";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {

        // XSS test (DAST test)
        return "<h1>Hello " + name + "</h1>";
    }
}