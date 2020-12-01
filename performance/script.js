import http from "k6/http";

export default function() {
    let response = http.get("http://localhost:8080/api/v1/account/e04b38bb-2c4f-4118-b051-b0f487621cb4");
};