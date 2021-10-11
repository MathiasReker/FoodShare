function changeHtml(url) {
    let contentToggle = document.getElementById("content-toggle");

    fetch(url).then(function (response) {
        return response.text();
    }).then(function (html) {
        contentToggle.innerHTML = html;
    })

}