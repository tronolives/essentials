import TaskClient from './clients/taskClient.js'

export default {
    getAllTasks: () => {
        let tasks

        TaskClient.get('/all')
        .then(result => tasks = result)

        return tasks
    }
}