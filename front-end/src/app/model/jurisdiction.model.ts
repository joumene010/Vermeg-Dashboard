import { Ret } from './ret.model';

export class Jurisdiction {
  prefix: string;
  description: string;
  rets: number[]; // Assuming rets are referenced by their IDs

  constructor(init?: Partial<Jurisdiction>) {
    Object.assign(this, init);
  }
}