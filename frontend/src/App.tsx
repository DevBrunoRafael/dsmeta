import Header from "./components/Header";
import SalesCard from "./components/SalesCard";

function App() {
  return (
    <> 
      <Header/>
      {/* <header>
        <h1>FUNCIONÁRIOS CADASTRADOS</h1>
      </header> */}
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard/>
          </div>
        </section>
      </main>
    </>
  )
}

export default App;
