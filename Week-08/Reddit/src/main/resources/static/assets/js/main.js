var nodes = document.getElementsByClassName('nav__item');
if (nodes[4].style.display == "none") {
    for (var i = 0; i < nodes.length - 1; i++) {
        nodes[i].width = '25%';
        nodes[i].style.width = "25%";
    }
} else {
    for (var j = 0; j < nodes.length - 1; j++) {
        nodes[j].style.width = "20%";
        nodes[0].style.marginLeft = "9%";
    }
}
