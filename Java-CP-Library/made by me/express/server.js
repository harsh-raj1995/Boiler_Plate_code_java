// Import the Express.js framework
// Express helps us create the web server and REST API
import express from "express";

// Create an Express application
// 'app' will be used to define routes and start the server
const app = express();

// Middleware to parse incoming JSON data
// Without this, req.body will not contain JSON sent by the client
app.use(express.json());


// --------------------------------------------------
// IN-MEMORY STUDENT DATA
// --------------------------------------------------

// We are storing student information inside an array
// No database is being used in this project
let students = [
    {
        id: 1,
        name: "Aman",
        course: "CSE"
    },
    {
        id: 2,
        name: "Priya",
        course: "ECE"
    }
];

// Variable used to generate a unique ID for every new student
// We start from 3 because IDs 1 and 2 are already used
let nextId = 3;


// ==================================================
// 1. GET /students
// ==================================================

// GET is used to READ/GET data from the server
//
// When the client sends:
// GET /students
//
// This function will execute
app.get("/students", (req, res) => {

    // Send the complete students array as JSON response
    res.json(students);
});


// ==================================================
// 2. POST /students
// ==================================================

// POST is used to CREATE/ADD new data
//
// Client sends:
// POST /students
//
// Example request body:
// {
//     "name": "Rahul",
//     "course": "IT"
// }
app.post("/students", (req, res) => {

    // req.body contains the JSON data sent by the client
    //
    // Destructuring extracts name and course from req.body
    const { name, course } = req.body;

    // Create a new student object
    const newStudent = {

        // Assign the current ID
        // Then increase nextId by 1 for the next student
        id: nextId++,

        // Store student's name
        name: name,

        // Store student's course
        course: course
    };

    // Add the new student object to the students array
    students.push(newStudent);

    // Send a response to the client
    res.json({
        message: "Student added"
    });
});


// ==================================================
// 3. PUT /students/:id
// ==================================================

// PUT is used to completely UPDATE a student
//
// Example:
// PUT /students/1
//
// Request body:
// {
//     "name": "Rahul Sharma",
//     "course": "CSE"
// }
app.put("/students/:id", (req, res) => {

    // req.params contains values from the URL
    //
    // For /students/1:
    // req.params.id = "1"
    //
    // It is initially a string, so convert it into a Number
    const id = Number(req.params.id);

    // Search for a student whose ID matches the requested ID
    //
    // find() returns the student object if found
    // Otherwise it returns undefined
    const student = students.find(s => s.id === id);

    // Check whether the student exists
    if (!student) {

        // If student does not exist,
        // return HTTP status code 404
        //
        // return is used so the function stops here
        return res.status(404).json({
            message: "Student not found"
        });
    }

    // Update the student's name
    // req.body.name contains the new name
    student.name = req.body.name;

    // Update the student's course
    // req.body.course contains the new course
    student.course = req.body.course;

    // Send success response
    res.json({
        message: "Student updated"
    });
});


// ==================================================
// 4. PATCH /students/:id
// ==================================================

// PATCH is used for PARTIAL UPDATE
//
// Unlike PUT, PATCH does not require all fields.
//
// Example:
// PATCH /students/1
//
// Request body:
// {
//     "course": "AI"
// }
//
// Only the course will be changed.
// The student's name will remain unchanged.
app.patch("/students/:id", (req, res) => {

    // Get the ID from the URL
    // Example: /students/1 → id = 1
    const id = Number(req.params.id);

    // Find the student with this ID
    const student = students.find(s => s.id === id);

    // If student does not exist
    if (!student) {

        // Send 404 Not Found response
        return res.status(404).json({
            message: "Student not found"
        });
    }

    // Check whether name was provided in the request
    //
    // We use !== undefined because the client may send
    // only course or only name
    if (req.body.name !== undefined) {

        // Update name only if name was provided
        student.name = req.body.name;
    }

    // Check whether course was provided
    if (req.body.course !== undefined) {

        // Update course only if course was provided
        student.course = req.body.course;
    }

    // Send success response
    res.json({
        message: "Student partially updated"
    });
});


// ==================================================
// 5. DELETE /students/:id
// ==================================================

// DELETE is used to REMOVE a student
//
// Example:
// DELETE /students/2
//
// This will delete the student whose ID is 2
app.delete("/students/:id", (req, res) => {

    // Get ID from URL
    // Convert string ID into number
    const id = Number(req.params.id);

    // findIndex() searches for the student
    // and returns its position/index in the array
    //
    // Example:
    // [
    //   { id: 1, ... },  // index 0
    //   { id: 2, ... }   // index 1
    // ]
    //
    // If ID 2 is searched, index = 1
    const index = students.findIndex(s => s.id === id);

    // If findIndex() cannot find the student,
    // it returns -1
    if (index === -1) {

        // Send 404 Not Found response
        return res.status(404).json({
            message: "Student not found"
        });
    }

    // Remove one student from the array
    //
    // index tells us WHERE to remove
    // 1 tells us HOW MANY elements to remove
    students.splice(index, 1);

    // Send success response
    res.json({
        message: "Student deleted"
    });
});


// ==================================================
// START THE SERVER
// ==================================================

// app.listen() starts the Express server
//
// 3000 is the port number
//
// The server can now be accessed using:
// http://localhost:3000
app.listen(3000, () => {

    // This message is printed in the terminal
    // when the server successfully starts
    console.log("Server running on port 3000");
});



///////////////////////////////////////////////

///////////////////////////////////////////////



import express from "express";

const app = express();

app.use(express.json());

let students = [
    { id: 1, name: "Aman", course: "CSE" },
    { id: 2, name: "Priya", course: "ECE" }
];

let nextId = 3;

app.get("/students", (req, res) => {
    res.json(students);
});

app.post("/students", (req, res) => {
    const { name, course } = req.body;

    const newStudent = {
        id: nextId++,
        name,
        course
    };

    students.push(newStudent);

    res.json({
        message: "Student added"
    });
});

app.put("/students/:id", (req, res) => {
    const id = Number(req.params.id);

    const student = students.find(s => s.id === id);

    if (!student) {
        return res.status(404).json({
            message: "Student not found"
        });
    }

    student.name = req.body.name;
    student.course = req.body.course;

    res.json({
        message: "Student updated"
    });
});

app.patch("/students/:id", (req, res) => {
    const id = Number(req.params.id);

    const student = students.find(s => s.id === id);

    if (!student) {
        return res.status(404).json({
            message: "Student not found"
        });
    }

    if (req.body.name !== undefined) {
        student.name = req.body.name;
    }

    if (req.body.course !== undefined) {
        student.course = req.body.course;
    }

    res.json({
        message: "Student partially updated"
    });
});

app.delete("/students/:id", (req, res) => {
    const id = Number(req.params.id);

    const index = students.findIndex(s => s.id === id);

    if (index === -1) {
        return res.status(404).json({
            message: "Student not found"
        });
    }

    students.splice(index, 1);

    res.json({
        message: "Student deleted"
    });
});

app.listen(3000, () => {
    console.log("Server running on port 3000");
});