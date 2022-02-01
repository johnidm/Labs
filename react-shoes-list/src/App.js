import './App.css';

import Body from './components/UI/Body';
import Shoes from './components/Shoes/Shoes';

const App = () => {
  const shoes = [
    {
      type: "Sneakers"
    },
    {
      type: "Boots"
    },
    {
      type: "Flip Flops"
    },
  ]

  return (
    <Body>
      <div>
        <Shoes items={shoes} />
      </div>    
    </Body>
  );
}

export default App;
