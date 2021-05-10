import axios from 'axios'

const client = axios.create({
    baseURL: 'http://localhost:8090/task/',
    timeout: 1000
})

export default client