
/* 1. BASICS */
console.log("Welcome to the Community Portal");

window.onload = () => {
    alert("Page Loaded Successfully");
};

/* 2. DATA */
const eventName = "Music Night";
const eventDate = "2026-06-10";
let seats = 5;

/* 3. EVENTS ARRAY */
let events = [
    { id: 1, name: "Music Night", category: "music", seats: 5 },
    { id: 2, name: "Food Festival", category: "food", seats: 3 },
    { id: 3, name: "Tech Talk", category: "tech", seats: 0 }
];

/* 5. CLASS (OOP) */
class Event {
    constructor(name, category, seats) {
        this.name = name;
        this.category = category;
        this.seats = seats;
    }

    checkAvailability() {
        return this.seats > 0;
    }
}

/* prototype method */
Event.prototype.info = function () {
    return `${this.name} - ${this.category}`;
};

/* 6. ADD EVENT */
function addEvent(name, category, seats) {
    events.push(new Event(name, category, seats));
}

/* 7. DOM RENDER */
const container = document.getElementById("eventContainer");

function renderEvents(list) {
    container.innerHTML = "";

    list.forEach(event => {
        if (event.seats > 0) {
            const div = document.createElement("div");
            div.className = "event";

            div.innerHTML = `
                <h3>${event.name}</h3>
                <p>${event.category}</p>
                <p>Seats: ${event.seats}</p>
                <button onclick="register(${event.id})">Register</button>
            `;

            container.appendChild(div);
        }
    });
}

/* 8. REGISTER */
function register(id) {
    try {
        let event = events.find(e => e.id === id);

        if (!event || event.seats <= 0) {
            throw "No seats available";
        }

        event.seats--;

        renderEvents(events);
        document.getElementById("msg").innerText = "Registered Successfully!";
    }
    catch (err) {
        alert(err);
    }
}

/* 9. FILTER */
document.getElementById("categoryFilter").onchange = function () {
    const val = this.value;

    if (val === "all") renderEvents(events);
    else renderEvents(events.filter(e => e.category === val));
};

/* SEARCH */
document.getElementById("search").onkeydown = function () {
    const val = this.value.toLowerCase();

    renderEvents(
        events.filter(e => e.name.toLowerCase().includes(val))
    );
};

/* 10. LOCAL STORAGE */
function savePreference(cat) {
    localStorage.setItem("preferred", cat);
}

/* restore */
window.addEventListener("load", () => {
    renderEvents(events);
});

/* 11. FORM */
document.getElementById("regForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const form = e.target;

    let name = form.name.value;
    let email = form.email.value;
    let event = form.event.value;

    document.getElementById("msg").innerText =
        `Thanks ${name}, registered for ${event}`;
});

/* 12. FETCH API (MOCK) */
async function fetchEvents() {
    try {
        let res = await fetch("https://jsonplaceholder.typicode.com/posts?_limit=3");
        let data = await res.json();

        console.log("Fetched Events:", data);
    }
    catch (err) {
        console.log(err);
    }
}

fetchEvents();

/* 14. jQuery */
$("#registerBtn").click(function () {
    $("#msg").fadeIn().text("Processing Registration...");
});
