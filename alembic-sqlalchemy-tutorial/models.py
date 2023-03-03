from sqlalchemy.orm import declarative_base
from sqlalchemy import Column, Integer, String, DateTime, Boolean
import datetime


Base = declarative_base()



class UserModel(Base):
    __tablename__ = 'user'

    id = Column(Integer, primary_key=True)
    first_name = Column(String, nullable=False)
    last_name = Column(String, nullable=False)
    birth_date = Column(DateTime, nullable=False)

    is_active = Column(Boolean, default=True)
    created_at = Column(DateTime, default=datetime.datetime.utcnow())


    def __repr__(self):
        return (
            f"<UserModel id={self.id} "
            f"first_name={self.first_name}> " 
            f"created_at={self.created_at} "
            f"is_active={self.is_active} "
        )
