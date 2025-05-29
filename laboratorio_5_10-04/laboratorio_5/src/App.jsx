import { useEffect } from 'react'
import './App.css'

function App() {
	const fetchData = async () => {
		try {
			const response = await fetch('https://jsonplaceholder.typicode.com/posts')
			const data = await response.json()
			console.log(data)
		} catch (error) {
			console.error('Error fetching data:', error)
		}
	}

	useEffect(() => {
		fetchData()
	}, [])

	return (
		<>
			<div>
				<h1>Laboratorio 5</h1>
			</div>
		</>
	)
}

export default App
